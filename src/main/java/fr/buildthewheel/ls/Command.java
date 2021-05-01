package fr.buildthewheel.ls;

public class Command {
    private CommandStatus status;

    public enum CommandStatus {
        ls,
        a,
        l,
        la,
        monRepertoire,
        R
    }
}
