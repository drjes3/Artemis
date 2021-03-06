/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:57:17 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.GenbankStreamSequence;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.io.Sequence;
import uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.Strand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Codon12CorrelationAlgorithm_ESTest extends Codon12CorrelationAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("T8Yh)cCY0");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      Integer integer0 = codon12CorrelationAlgorithm0.getDefaultStepSize(114);
      assertEquals(14, (int)integer0);
      assertEquals("Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Bases bases0 = new Bases((Sequence) null);
      Strand strand0 = bases0.getReverseStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      Integer integer0 = codon12CorrelationAlgorithm0.getDefaultStepSize(3971);
      assertEquals(496, (int)integer0);
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
      assertNotNull(integer0);
      assertEquals("Reverse Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      // Undeclared exception!
      try { 
        codon12CorrelationAlgorithm0.getValues(1461, 3663, (float[]) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.StreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("DE`Lx1$@]M");
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence(genbankStreamSequence0);
      Bases bases0 = new Bases(emblStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      float[] floatArray0 = new float[1];
      // Undeclared exception!
      try { 
        codon12CorrelationAlgorithm0.getValues(4, 3975, floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = null;
      try {
        codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm((Strand) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("5", "5");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      Integer integer0 = codon12CorrelationAlgorithm0.getDefaultStepSize(1048576);
      assertEquals("Reverse Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
      assertEquals(131072, (int)integer0);
      assertNotNull(integer0);
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("5", "5");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      Integer integer0 = codon12CorrelationAlgorithm0.getDefaultStepSize(2);
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
      assertEquals("Reverse Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      Integer integer0 = codon12CorrelationAlgorithm0.getDefaultMinWindowSize();
      assertNotNull(integer0);
      assertEquals("Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
      assertEquals(48, (int)integer0);
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      Integer integer0 = codon12CorrelationAlgorithm0.getDefaultMaxWindowSize();
      assertEquals(600, (int)integer0);
      assertEquals("Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
      assertNotNull(integer0);
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("5", "5");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      Integer integer0 = codon12CorrelationAlgorithm0.getDefaultWindowSize();
      assertEquals("Reverse Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
      assertNotNull(integer0);
      assertEquals(240, (int)integer0);
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("DE`Lx1$@]M");
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence(genbankStreamSequence0);
      Bases bases0 = new Bases(emblStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      float[] floatArray0 = new float[16];
      codon12CorrelationAlgorithm0.getValues(4, 3975, floatArray0);
      assertEquals("Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("IV},^^@Gh");
      Bases bases0 = new Bases(rawStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      float[] floatArray0 = new float[7];
      // Undeclared exception!
      try { 
        codon12CorrelationAlgorithm0.getValues(830, 12, floatArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unexpected exception: org.evosuite.runtime.mock.java.lang.MockThrowable: start: 829 > end: 12
         //
         verifyException("uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      // Undeclared exception!
      try { 
        codon12CorrelationAlgorithm0.getValues(0, 3663, (float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Bases bases0 = new Bases((Sequence) null);
      Strand strand0 = bases0.getReverseStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      Float float0 = codon12CorrelationAlgorithm0.getMaximumInternal();
      assertEquals("Reverse Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
      assertEquals(100.0F, (float)float0, 0.01F);
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      int int0 = codon12CorrelationAlgorithm0.getValueCount();
      assertEquals("Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
      assertEquals(3, int0);
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("5", "5");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      Float float0 = codon12CorrelationAlgorithm0.getMinimumInternal();
      assertEquals("Reverse Correlation Scores", codon12CorrelationAlgorithm0.getAlgorithmName());
      assertEquals(0.0F, (float)float0, 0.01F);
      assertTrue(codon12CorrelationAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("5", "5");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      Codon12CorrelationAlgorithm codon12CorrelationAlgorithm0 = new Codon12CorrelationAlgorithm(strand0);
      codon12CorrelationAlgorithm0.getAverage();
  }
}
