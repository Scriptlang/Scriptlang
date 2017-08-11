import os, sys

inputfile = os.path.abspath(sys.argv[1]) if len(sys.argv) > 1 else ""

os.chdir(os.path.dirname(os.path.realpath(__file__)) + "/../bin")
os.system("java main.Scriptlang " + inputfile)