@echo off

if not exist C:\Users\abdul\Documents\codes\NameCreation.CreateName\srd\main.class javac src\Main.java -Xlint:none

java \src\Main %1
