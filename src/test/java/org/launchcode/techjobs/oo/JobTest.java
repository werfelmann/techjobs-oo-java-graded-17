package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1, testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality Control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job();
        String testJobString = testJob.toString();
        assertTrue(testJobString.startsWith(System.lineSeparator()));
        assertTrue(testJobString.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job();
        String testJobString = testJob.toString();
        assertTrue(testJobString.contains("ID: "));
        assertTrue(testJobString.contains("Name: "));
        assertTrue(testJobString.contains("Employer: "));
        assertTrue(testJobString.contains("Location: "));
        assertTrue(testJobString.contains("Position Type: "));
        assertTrue(testJobString.contains("Core Competency: "));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
        String testJobString = testJob.toString();
        assertTrue(testJobString.contains("Data not available"));
    }

    @Test
    public void testToStringReturnsOopsMessageIfItContainsOnlyID() {
        Job testJob = new Job();
        String testJobString = testJob.toString();
        assertTrue(testJobString.equals("OOPS! This job does not seem to exist."));
    }
}
