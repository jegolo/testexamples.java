package de.lostuxos.testexamples.approvals;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SampleArrayTest {
    @Test
    public void testList() throws Exception
    {
        String[] names = {"Llewellyn", "James", "Dan", "Jason", "Katrina"};
        Arrays.sort(names);
        Approvals.verifyAll("", names);
    }
}
