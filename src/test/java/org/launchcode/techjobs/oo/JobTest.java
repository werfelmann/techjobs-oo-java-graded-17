package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getName() == "Product Tester");
//        assertTrue();
//        assertTrue();
//        assertTrue();
//        assertTrue();
//        assertEquals();
//        assertEquals();
//        assertEquals();
//        assertEquals();
//        assertEquals();
    }
}
