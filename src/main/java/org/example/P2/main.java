package org.example.P2;

import org.example.P1.newstudent;

public class main {
    newIntelligentStudent ns = new newIntelligentStudent();
    //ns.psp = 50; this is also not accessible as it is in a different package and private only allows access to same class
    //ns.joinclass(); thus this is also not public and thus cannot be accessed from outside packages
    //ns.email = "adedoqw"; //thus if we put something as public, it is accessible anywhere and everywhere
}
