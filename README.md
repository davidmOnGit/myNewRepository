myNewRepository
===============
intention of this project was to play around a little with maven, jsf, spring, hibernate and mysql.

i wanted to have a base skelleton with these technologies I could use for new java web apps.

the aim was to have a simple way from frontent, jsf beans, spring bean based services and spring based data access objects
form managing hibernate persistence for mysql databases.

as one can see from the code jsf beans are solely used for managing frontend data. for business logic spring beans are integrated
as services in jsf. data access objects provide persistence operations to the services.

i wanted to have the whole thing without xml config files, just annotations in the classes. this was pretty forward to implement.
the only "tricky" part was to inject the hibernate session factory to the data access objects when changing from xml to
annotations. i extended the dao support for hibernate and when using xml i could declare the session factory as a field with 
reference to the bean. using annotations this doesnt work because the field of the extended class is private. though there is 
some protected method to set the factory. so i had to write my own setter which calls this super method. this one could be used
for setter injection annotation of spring. this works but feels some kind of hacky because i would have to add this method
manually every time i create a new data access object implementation...
