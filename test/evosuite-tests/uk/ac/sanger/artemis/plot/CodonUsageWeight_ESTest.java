/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 16:00:56 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.plot.CodonUsageWeight;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.Strand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodonUsageWeight_ESTest extends CodonUsageWeight_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.biojava.bio.symbol.CompoundLocation", "org.biojava.bio.symbol.CompoundLocation");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("org.biojava.bio.symbol.CompoundLocation", "org.biojava.bio.symbol.CompoundLocation");
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence(fastaStreamSequence0);
      Bases bases0 = new Bases(emblStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      CodonUsageWeight codonUsageWeight0 = null;
      try {
        codonUsageWeight0 = new CodonUsageWeight(mockFile0, strand0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("s|");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      CodonUsageWeight codonUsageWeight0 = new CodonUsageWeight(mockFile0, strand0);
      float float0 = codonUsageWeight0.getCodonValue('~', ',', '~');
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CodonUsageWeight codonUsageWeight0 = null;
      try {
        codonUsageWeight0 = new CodonUsageWeight((File) null, (Strand) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      CodonUsageWeight codonUsageWeight0 = null;
      try {
        codonUsageWeight0 = new CodonUsageWeight((File) null, strand0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - created a null Document
         //
         verifyException("uk.ac.sanger.artemis.util.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFile mockFile0 = new MockFile("DBXREF: ID=");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("DBXREF: ID=", "DBXREF: ID=");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      MockFileWriter mockFileWriter0 = new MockFileWriter("DBXREF: ID=", false);
      CodonUsageWeight codonUsageWeight0 = new CodonUsageWeight(mockFile0, strand0);
      assertEquals("DBXREF: ID=", codonUsageWeight0.getName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("(", "s|");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      CodonUsageWeight codonUsageWeight0 = new CodonUsageWeight(mockFile0, strand0);
      float float0 = codonUsageWeight0.getCodonValue('i', 'i', 'y');
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("s|");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      CodonUsageWeight codonUsageWeight0 = new CodonUsageWeight(mockFile0, strand0);
      codonUsageWeight0.getName();
  }
}
