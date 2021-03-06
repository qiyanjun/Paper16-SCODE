package edu.virginia.uvacluster.internal.feature.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import edu.virginia.uvacluster.internal.Cluster;
import edu.virginia.uvacluster.internal.feature.Degree;
import edu.virginia.uvacluster.internal.feature.FeatureSet;
import edu.virginia.uvacluster.internal.test.TestNetwork;

public class DegreeTest extends TestNetwork {

	@Test
	public void shouldCalculateDegrees() {
		List<Double> result;
		FeatureSet degree = new Degree(null);
		Cluster cluster = new Cluster(Arrays.asList(degree), getCompleteSubNetwork());
		result = degree.computeInputs(cluster);
		Collections.sort(result);
		
		assertEquals("Degrees should be correct",1.0,result.get(0),0.001);
		assertEquals("Degrees should be correct",1.0,result.get(1),0.001);
		assertEquals("Degrees should be correct",2.0,result.get(2),0.001);
		assertEquals("Degrees should be correct",2.0,result.get(3),0.001);
		assertEquals("Degrees should be correct",4.0,result.get(4),0.001);
		assertEquals("Result should have 5 doubles",5,result.size());
	}

}
