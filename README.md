# Welcome to Articulate SDK

The Articulate SDk is a Java Library to generate Articulate Templates programmatically. Please see the Articulate React Library for information on Articulate: https://github.com/owheatley35/articulate

# Getting Started

Generate a template using the template builder. Below shows a code example of building a simple template with a title.

    ArticulateTemplateBuilder builder = new ArticulateTemplateBuilder("1.0.0", new PageConfiguration());
    builder.addComponent(new PlainTitleComponent("Hello World"));
    ArticulateTemplate template = builder.build();

You can then get the JSON template as String by running:

    template.getRenderedTemplateString();