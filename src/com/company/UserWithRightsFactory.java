package com.company;

import java.util.List;

public abstract class UserWithRightsFactory {

    protected abstract User createUser();
    protected abstract List<Right> getRights();
}
