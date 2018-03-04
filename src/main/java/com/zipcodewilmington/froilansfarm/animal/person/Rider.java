package com.zipcodewilmington.froilansfarm.animal.person;

import com.zipcodewilmington.froilansfarm.Rideable;

public interface Rider {
    //checks if the specific Rideable object is being mounted or
    // being operated and then return a Rideable object, a
    // nd set its isMounted or isCurrentlyOperated state to true;

    Readable mount(Rideable availableRideable);

    //After being dismounted, set the isMounted state of the Rideable object to false.
    void disMount(Rideable aRideable);
}
