package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;

public abstract class Storage {
    /**
     * Loads data from storage file
     */
    public abstract AddressBook load() throws StorageOperationException;
    
    /**
     * Gets the path of storage file
     */
    public abstract String getPath();
    
    /**
     * Saves all data to storage file.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;

    /**
     * Signals that the given file path does not fulfill the storage file path constraints.
     */
    public static class InvalidStorageFilePathException extends IllegalValueException {
        public InvalidStorageFilePathException(String message) {
            super(message);
        }
    }
    
    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage file.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }
    
}
