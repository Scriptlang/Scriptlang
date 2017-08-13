# Scriptlang

Scriptlang is a cross-platform solution/alternative to the current scripting languages Batch and Shell.

___
It is an intermediate language that compiles to either Batch or Shell and is capable of running its own scripts in a "JIT" fashion without having to compile to either language (which are platform dependent).

Also, it will be possible to translate the intermediate language into any other scripting language, for example Powershell.

# NOTE: This is a long term project with no release date set  

# How to compile

We don't have a build system set in place just yet. You'll have to use Eclipse and import this project into your IDE. 

# How to run  

For now, we can only run scripts as tests.  

To run them, simply type on the command line:  

```bash
python test.pyc <scriptfile>
```

For example:

```bash
python test.pyc ex1.sl
```

Make sure your current working directory is `<top>/test`.
