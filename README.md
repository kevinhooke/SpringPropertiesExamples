# SpringPropertiesExamples
Simple examples using different approaches to supporting properties in Spring Framework based applications.

##SpringPropertyPlaceholderExample
Uses a PropertyPlaceholderConfigurer to inject properties into:

1. bean located with component-scan using @Value and SpEL
2. xml declaration for bean using property placeholders in xml config

Uses a util:properies bean, injects property into

3. bean using @Value and SpEL to reference the properties bean
