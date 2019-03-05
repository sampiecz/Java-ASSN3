JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class: ; $(JC) $(JFLAGS) $*.java

CLASSES = \
USMoney.java\
USMoneyDemo.java\
Date.java\
DateDemo.java

default: classes

classes: $(CLASSES:.java=.class)

clean: ; $(RM) *.class
