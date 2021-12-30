package uk.co.downthewire.example;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");

        Options options = new Options();
        options.addOption("a", "add", true, "Add new task")
            .addOption("d", "date", true, "Date information")
            .addOption("t", "time", true, "Time information");
        
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("CLITester", options);
            System.exit(1);
        }
      
        if(cmd.hasOption("add")) {
            String taskName = cmd.getOptionValue("add"); 
            System.out.println("Adding a task with name: " + taskName);
        }
        if(cmd.hasOption("date")) {
            String date = cmd.getOptionValue("date"); 
            System.out.println("Adding a task with date: " + date);
        }
        if(cmd.hasOption("time")) {
            String time = cmd.getOptionValue("time"); 
            System.out.println("Adding a task with time: " + time);
        }
    }
}