/* OrthologPanel.java
 * This file is part of Artemis
 *
 * Copyright (C) 2007  Genome Research Limited
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * $Header: //tmp/pathsoft/artemis/uk/ac/sanger/artemis/components/genebuilder/ortholog/MatchPanel.java,v 1.4 2007-05-24 08:57:31 tjc Exp $
 */

package uk.ac.sanger.artemis.components.genebuilder.ortholog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

import uk.ac.sanger.artemis.FeatureChangeEvent;
import uk.ac.sanger.artemis.FeatureChangeListener;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.io.DocumentEntry;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierLazyLoading;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.util.StringVector;
import uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox;

/**
 * For similarity, orthologue, paralogue qualifiers
 */
public class MatchPanel extends JPanel
                      implements FeatureChangeListener
{
  private static final long serialVersionUID = 1L;
  private QualifierVector matchQualifiers;
  private static Vector databases;
  private SimilarityTable similarityTable;
  private OrthologTable orthologTable;
  private Vector editableComponents;
  private JButton hide_show_ortho;
  private JButton hide_show_sim;
  
  public MatchPanel(final Feature feature)
  {
    super(new BorderLayout());
    updateFromFeature(feature);
  }
  
  /**
   * Return true if this is a Ortholog qualifier
   * @param qualifier
   * @return
   */
  public boolean isMatchTag(final Qualifier qualifier)
  {
    if(qualifier.getName().equals("ortholog") ||
       qualifier.getName().equals("similarity"))
      return true;
    return false;
  }
  
  private Component createMatchQualifiersComponent(final Feature feature)
  {
    editableComponents = new Vector();
    Qualifier orthoQualifier = matchQualifiers.getQualifierByName("ortholog");
    Qualifier paraQualifier  = matchQualifiers.getQualifierByName("paralog");
    Qualifier simQualifier   = matchQualifiers.getQualifierByName("similarity");
    
    if(databases == null)
    {
      DocumentEntry entry = (DocumentEntry)feature.getEmblFeature().getEntry();
      DatabaseDocument doc = (DatabaseDocument)entry.getDocument();
      databases = (Vector)doc.getDatabaseNames();
    }
    
    //
    // ortholog
    Box matchVerticalBox = Box.createVerticalBox();
    JButton addOrthoButton = new JButton("ADD ORTHOLOG");
    addOrthoButton.setOpaque(false);
    addOrthoButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      { 
        JExtendedComboBox dbs = new JExtendedComboBox(databases);
        
        JTextField accession = new JTextField(15);
        
        Box yBox = Box.createHorizontalBox();
        yBox.add(dbs);
        yBox.add(accession);

        int select = JOptionPane.showConfirmDialog(null, 
              yBox, "Add Ortholog",
              JOptionPane.OK_CANCEL_OPTION);
        if(select == JOptionPane.CANCEL_OPTION)
          return;
        
        add("ortholog", ((String)dbs.getSelectedItem())+":"+
                        accession.getText().trim(), feature);
      }
    });
    Box xBox = Box.createHorizontalBox();
    xBox.add(addOrthoButton);
    xBox.add(Box.createHorizontalGlue());
    matchVerticalBox.add(xBox);
    
    
    ///
    /// temp
    ///
    //if(orthoQualifier != null)
    //{
      if(hide_show_ortho == null)
        hide_show_ortho = new JButton("-");
      orthologTable = new OrthologTable(orthoQualifier);
      addHideShowButton(orthologTable.getTable(), hide_show_ortho);
      xBox.add(hide_show_ortho);
      editableComponents.add(orthologTable);
      matchVerticalBox.add(orthologTable.getTable().getTableHeader());
      matchVerticalBox.add(orthologTable.getTable());
    //}

    
    //
    // paralog
    addSeparator(matchVerticalBox);
    JButton addParaButton = new JButton("ADD PARALOG");
    addParaButton.setOpaque(false);
    addParaButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      { 
        JExtendedComboBox dbs = new JExtendedComboBox(databases);
        JTextField accession = new JTextField(15);
        
        Box yBox = Box.createHorizontalBox();
        yBox.add(dbs);
        yBox.add(accession);

        int select = JOptionPane.showConfirmDialog(null, 
              yBox, "Add Paralog",
              JOptionPane.OK_CANCEL_OPTION);
        if(select == JOptionPane.CANCEL_OPTION)
          return;
        
        add("paralog", ((String)dbs.getSelectedItem())+":"+
                        accession.getText().trim(), feature);
      }
    });
    xBox = Box.createHorizontalBox();
    xBox.add(addParaButton);
    xBox.add(Box.createHorizontalGlue());
    matchVerticalBox.add(xBox);
    
    if(paraQualifier != null)
    {
      StringVector paralogs = paraQualifier.getValues();
      for(int i=0; i<paralogs.size(); i++)
      {
        JTextField paralog = new JTextField( (String)paralogs.get(i) );
        matchVerticalBox.add(paralog);
      }
    }
    
    
    //
    // similarity
    addSeparator(matchVerticalBox);
    JButton addSimButton = new JButton("ADD SIMILARITY");
    addSimButton.setOpaque(false);
    addSimButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      { 
        JTextField accession = new JTextField(15);
        
        Box yBox = Box.createHorizontalBox();
        yBox.add(accession);

        int select = JOptionPane.showConfirmDialog(null, 
              yBox, "Add Similarity",
              JOptionPane.OK_CANCEL_OPTION);
        if(select == JOptionPane.CANCEL_OPTION)
          return;
        
        add("similarity", accession.getText().trim(), feature);
      }
    });
    xBox = Box.createHorizontalBox();
    xBox.add(addSimButton);
    xBox.add(Box.createHorizontalGlue());
    matchVerticalBox.add(xBox);
    
    if(simQualifier != null)
    {
      if(simQualifier instanceof QualifierLazyLoading)
        ((QualifierLazyLoading)simQualifier).setForceLoad(true);
      
      similarityTable = new SimilarityTable(simQualifier);
      if(hide_show_sim == null)
        hide_show_sim = new JButton("-");
      addHideShowButton(similarityTable.getTable(), hide_show_sim);
      editableComponents.add(similarityTable);
      
      xBox.add(similarityTable.getInfoLevelButton());
      xBox.add(hide_show_sim);
      matchVerticalBox.add(xBox);
      matchVerticalBox.add(similarityTable.getTable().getTableHeader());
      matchVerticalBox.add(similarityTable.getTable());
    }

    return matchVerticalBox;
  }
  
  /**
   * Add hide/show button 
   * @param box
   */
  private void addHideShowButton(final JTable table, final JButton hide_show)
  {
    hide_show.setOpaque(false);
    
    // remove any old listeners
    ActionListener l[] = hide_show.getActionListeners();
    if(l != null)
      for(int i=0;i<l.length;i++)
        hide_show.removeActionListener(l[i]);
    
    hide_show.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        if(hide_show.getText().equals("-"))
        {
          hide_show.setText("+");
          table.setVisible(false);
          table.getTableHeader().setVisible(false);
        }
        else
        {
          hide_show.setText("-");
          table.setVisible(true);
          table.getTableHeader().setVisible(true);
        }
      }
    });
  }
  
  /**
   * Update ortho/paralogs for a feature
   * @param feature
   */
  public void updateFromFeature(final Feature feature)
  {
    removeAll();
    if(matchQualifiers != null)
      feature.removeFeatureChangeListener(this);
    matchQualifiers = feature.getQualifiers().copy();
    
    matchQualifiers = new QualifierVector();
    final QualifierVector qualifiers = feature.getQualifiers();  
    for(int i = 0 ; i < qualifiers.size(); ++i) 
    {
      Qualifier qualifier = (Qualifier)qualifiers.elementAt(i);
      if(isMatchTag(qualifier))
        matchQualifiers.addElement(qualifier.copy());
    }
   
    feature.addFeatureChangeListener(this);  
    add(createMatchQualifiersComponent(feature));
    repaint();
    revalidate();
  }

  /**
   * Add ortholog/paralog
   * @param name  ortholog or paralog
   * @param value
   */
  public void add(final String name, final String value, final Feature feature)
  {
    final int index;
    
    Qualifier qualifier = matchQualifiers.getQualifierByName(name);
    
    if(qualifier == null)
    {
      qualifier = new Qualifier(name);
      index = -1;
    }
    else
     index = matchQualifiers.indexOf(qualifier);
       
    qualifier.addValue(value);

    if(index > -1)
    {
      matchQualifiers.remove(index);
      matchQualifiers.add(index, qualifier);
    }
    else
      matchQualifiers.add(qualifier);
    
    removeAll();
    add(createMatchQualifiersComponent(feature));
    repaint();
    revalidate();
  }
  
  /**
   * Separator between matches
   * @param matchVerticalBox
   */
  private void addSeparator(final Box matchVerticalBox)
  {
    JSeparator separator = new JSeparator();
    
    int width = getSize().width;
    if(width <= 0)
      width = 700;

    separator.setForeground(Color.LIGHT_GRAY);
    separator.setPreferredSize(new Dimension(width,10));
    separator.setMaximumSize(new Dimension(width,10));
    matchVerticalBox.add(Box.createVerticalStrut(5));
    matchVerticalBox.add(separator);
  }
  
  /**
   * Get the latest (edited) controlled vocab qualifiers
   * @return
   */
  public QualifierVector getMatchQualifiers()
  {
    if(editableComponents != null)
    {
      for(int i=0; i<editableComponents.size(); i++)
      {
        AbstractMatchTable matchTable = (AbstractMatchTable)editableComponents.get(i);
        System.out.println("CHECKING MATCHES "+i);
        if(matchTable.isQualifierChanged())
        {
          matchTable.updateQualifier(matchQualifiers);
        }
      }
    }
    return matchQualifiers;
  }
  
  public void featureChanged(FeatureChangeEvent event)
  {
    updateFromFeature(event.getFeature());
  }
  
}