package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public class StorageStub extends Storage{

    @Override
    public AddressBook load() throws StorageOperationException {
        return null;
    }

    @Override
    public String getPath() {
        return "";
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
    }

}
