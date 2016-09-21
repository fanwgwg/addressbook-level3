package seedu.addressbook.commands;

public class SortCommand extends Command{
    
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" 
            + "Sort list based on Lexicographical order.\n\t"
            + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_SUCCESS = "list sorted.";
    
    @Override
    public CommandResult execute() {
        addressBook.sort();
        return new CommandResult(MESSAGE_SUCCESS);
    }

}
