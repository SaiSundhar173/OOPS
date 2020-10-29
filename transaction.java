package bankdemo;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
public class transaction {
    public FileWriter f4,f5;
    public String s9,s10,curr;
    public JFrame f,f1,f2,fhome,finfo,fdep,fwith,ftransfer;
    public JLabel lblmobile,mobile,lblwithinfo2,lbldep2,lbldep3,lbl1,lbl2,hlbl,lblintro,lblsign,lbllog,lblamt,lblname,username,amount,lblamount1,lblamount,infolbl,lbldepinfo,lbldep,lbltrantoacct,lblwithinfo,lblwith;
    public JTextField txtwith2,txtdep2,txtdep3,txt1,txt2,txt10,mob,txtdep,txtdep1,txtwith,txttran,txttrantoacct;
    public JPasswordField pass1,pass2,pass10; 
    public JButton bdepok2,b1,b2,b3,b4,b5,b6,binfo,bdeposit,bwithdraw,btransfer,blogout,bok,bdepok,bwithok,btranok;
    public transaction()
    {
        //User PAGE
        fhome=new JFrame("Welcome");
        fhome.setVisible(false);
        fhome.setSize(800,800);
        fhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fhome.setLayout(null);
        fhome.getContentPane().setBackground(Color.red);
        
        hlbl=new JLabel("WELCOME TO ONLINE BANKING");
        blogout=new JButton("Logout");
        binfo=new JButton("Information");
        bdeposit=new JButton("Deposit");
        bwithdraw=new JButton("Withdraw");
        btransfer=new JButton("Transfer");
        
        hlbl.setBounds(275,100,300,30);
        binfo.setBounds(200,150,150,30);
        bdeposit.setBounds(200,220,150,30);
        bwithdraw.setBounds(400,150,150,30);
        btransfer.setBounds(400,220,150,30);
        blogout.setBounds(300,420,150,30);
           
        fhome.add(hlbl);
        fhome.add(binfo);
        fhome.add(bdeposit);
        fhome.add(bwithdraw);
        fhome.add(btransfer);
        fhome.add(blogout);
        
        //Deposit page
        fdep=new JFrame("Deposit");
        fdep.setVisible(false);
        fdep.setSize(800,800);
        fdep.setLayout(null);
        fdep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbldep=new JLabel("Amount");
        txtdep=new JTextField();
        bdepok=new JButton("OK");
               
        lbldep.setBounds(250,150,150,30);
        txtdep.setBounds(425,150,100,30);
        bdepok.setBounds(325,200,100,30);

        fdep.add(lbldep);
        fdep.add(txtdep);
        fdep.add(bdepok);
        
        //Withdraw page
        fwith=new JFrame("Withdraw");
        fwith.setVisible(false);
        fwith.setSize(800,800);
        fwith.setLayout(null);
        fwith.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        lblwithinfo=new JLabel("Amount");
        txtwith=new JTextField();
        bwithok=new JButton("OK");
               
        lblwithinfo.setBounds(275,100,300,30);
        txtwith.setBounds(425,100,100,30);
        bwithok.setBounds(325,200,100,30);

        fwith.add(lblwithinfo);
        fwith.add(txtwith);
        fwith.add(bwithok);
 
        //Home Page
        f1=new JFrame("Welcome");
        f1.setVisible(true);
        f1.setSize(800,800);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        
        lblintro=new JLabel("BANKING");
        b3=new JButton("LOGIN");
        b4=new JButton("SIGNUP");
        lbllog=new JLabel("HAVE AN ACCOUNT?? LOGIN ELSE SIGNUP");
        
        lblintro.setBounds(350,250,300,30);
        b3.setBounds(325,350,100,30);
        b4.setBounds(325,400,100,30);
        lbllog.setBounds(250,450,300,30);
        
        f1.add(lblintro);
        f1.add(b3);
        f1.add(b4);
        f1.add(lbllog);
       
        //LOGIN PAGE
        f=new JFrame("LOGIN");
        f.setLayout(null);
        f.setVisible(false);
        f.setSize(800,800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbllog=new JLabel("ENTER YOUR DETAILS");
        lbl1=new JLabel("MOBILE NUMBER");
        lbl2=new JLabel("PASSWORD");
        txt10=new JTextField();
        pass10=new JPasswordField();
        b5=new JButton("OK");
        b6=new JButton("CANCEL");

        lbllog.setBounds(320,100,300,30);
        lbl1.setBounds(250,150,100,30);
        lbl2.setBounds(250,220,100,30);
        txt10.setBounds(400,150,100,30);
        pass10.setBounds(400,220,100,30);
        b5.setBounds(250,275,100,30);
        b6.setBounds(400,275,100,30);

        f.add(lbllog);
        f.add(lbl1);
        f.add(txt10);
        f.add(lbl2);
        f.add(pass10);
        f.add(b5);
        f.add(b6);
                 
        //SIGNUP PAGE
        f2=new JFrame("SIGNUP");
        f2.setVisible(false);
        f2.setSize(800,800);
        f2.setLayout(null);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        lblamt=new JLabel("MOBILE NUMBER");
        lblsign=new JLabel("PLEASE FILL THE APPROPRIATE DETAILS");
        JLabel lbluser=new JLabel("USERNAME");
        JLabel lblpass=new JLabel("PASSWORD");
        JLabel cnfmpass=new JLabel("CONFIRM PASSWORD");
        mob=new JTextField();
        txt1=new JTextField();
        pass1=new JPasswordField();
        pass2=new JPasswordField();
        b1=new JButton("SUBMIT");
        b2=new JButton("CANCEL");
               
        lblamt.setBounds(250,360,100,30);
        mob.setBounds(400,360,100,30);
        lblsign.setBounds(280,100,300,30);
        lbluser.setBounds(250,150,100,30);
        lblpass.setBounds(250,220,100,30);
        cnfmpass.setBounds(250,290,100,30);
        txt1.setBounds(400,150,150,30);
        pass1.setBounds(400,220,150,30);
        pass2.setBounds(400,290,150,30);
        b1.setBounds(250,450,100,30);
        b2.setBounds(450,450,100,30);

        f2.add(lblamt);
        f2.add(mob);
        f2.add(lblsign);
        f2.add(lbluser);
        f2.add(lblpass);
        f2.add(cnfmpass);
        f2.add(txt1);
        f2.add(pass1);
        f2.add(pass2);
        f2.add(b1);
        f2.add(b2);
        
        //Transfer Page
        ftransfer=new JFrame("Transfer");
        ftransfer.setVisible(false);
        ftransfer.setSize(800,800);
        ftransfer.setLayout(null);
        ftransfer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        lbldep2=new JLabel("To");
        txtdep2=new JTextField();
        lbldep3=new JLabel("Amount");
        txtdep3=new JTextField();
        bdepok2=new JButton("OK");
               
        lbldep2.setBounds(250,150,150,30);
        txtdep2.setBounds(425,150,100,30);
        lbldep3.setBounds(250,200,150,30);
        txtdep3.setBounds(425,200,100,30);
        bdepok2.setBounds(325,250,100,30);

        ftransfer.add(lbldep2);
        ftransfer.add(txtdep2);
        ftransfer.add(lbldep3);
        ftransfer.add(txtdep3);
        ftransfer.add(bdepok2);
        
        //Action listener for buttons
        handler l=new handler();
        b1.addActionListener(l);
        b2.addActionListener(l);
        b3.addActionListener(l);
        b4.addActionListener(l);
        b5.addActionListener(l);
        b6.addActionListener(l);
        binfo.addActionListener(l);
        bdeposit.addActionListener(l);
        bwithdraw.addActionListener(l);
        btransfer.addActionListener(l);
        blogout.addActionListener(l);
        bdepok.addActionListener(l);
        bwithok.addActionListener(l);
        bdepok2.addActionListener(l);
    }
    private class handler implements ActionListener
    {
        String s1,s2,s3,s4,c1,c2,c3;
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==b3)
            {
                f1.setVisible(false);
                f.setVisible(true);
            }
            if(e.getSource()==b4)
            {
                f1.setVisible(false);
                f2.setVisible(true);             
            }
            if(e.getSource()==b1)
            {
                f2.dispose();
                f1.setVisible(true);
                s1=txt1.getText();
                s2=pass1.getText();
                s3=pass2.getText();
                s4=mob.getText();
                  try 
                  {
                      if(s2.equals(s3))
                      {
                         FileWriter file1=new FileWriter("names.txt",true);
                         FileWriter file2=new FileWriter("pass.txt",true);
                         FileWriter file3=new FileWriter("mobile.txt",true);
                         FileWriter file4=new FileWriter(s4+".txt",true);
                         BufferedWriter b1=new BufferedWriter(file1);
                         BufferedWriter b2=new BufferedWriter(file2);
                         BufferedWriter b3=new BufferedWriter(file3);
                         BufferedWriter b4=new BufferedWriter(file4);
                         b1.write(s1);
                         b1.newLine();
                         b2.write(s2);
                         b2.newLine();
                         b3.write(s4);
                         b3.newLine();
                         b4.write("0");
                         b4.newLine();
                         b1.close();
                         b2.close();
                         b3.close();
                         b4.close();
                         file1.close();
                         file2.close();
                         file3.close();
                         file4.close();
                         JOptionPane.showMessageDialog(null,"WELCOME "+s1+"\n SIGNED IN SUCCESSFULLY");
                      }
                      else
                      {
                          JOptionPane.showMessageDialog(null,"OOPS!\nPLEASE ENTER CORRECT PASSWORD");
                          f1.setVisible(false);
                          f2.setVisible(true);
                      }
                  } 
                  catch (Exception ex)
                  {
                  }
              }
              if(e.getSource()==b2)
              {
                  f2.dispose();
                  f1.setVisible(true);
              }
              if(e.getSource()==b5)
              {
                 s1=txt10.getText();
                 s2=pass10.getText();
                 curr=s1;
                 int flag=0;
                 try
                 {
                     FileReader f1=new FileReader("mobile.txt");
                     FileReader f2=new FileReader("pass.txt");
                     FileReader name=new FileReader("names.txt");
                     BufferedReader b1=new BufferedReader(f1);
                     BufferedReader b2=new BufferedReader(f2);
                     BufferedReader b3=new BufferedReader(name);
                     for(c1=b1.readLine(),c2=b2.readLine(),c3=b3.readLine();c1!=null&&c2!=null&&c3!=null;c1=b1.readLine(),c2=b2.readLine(),c3=b3.readLine())
                     {
                        if(c1.equals(s1)&&c2.equals(s2))
                        {
                            flag=1;
                            JOptionPane.showMessageDialog(null,"WELCOME "+c3+" \n LOGGED IN SUCCESSFULLY");
                            f.dispose();
                            fhome.setVisible(true);
                            b1.close();
                            b2.close();
                            f1.close();
                            f2.close();
                            break;
                        }
                     }
                     b1.close();
                     b2.close();
                     f1.close();
                     f2.close();
                     if(flag==0){
                        JOptionPane.showMessageDialog(null,"OOPS INCORRCT PASSWORD");
                     }     
                }
                catch(Exception ae)
                {
                }
            }
            if(e.getSource()==b6)
            {
                f.dispose();
                f1.setVisible(true);
            }
            if(e.getSource()==binfo)
            {
                 String str1 = null,str2 = null;
                 String amt = null;
                 String str=null;
                 try
                 {
                    FileReader f1=new FileReader("names.txt");
                    FileReader f2=new FileReader("mobile.txt");
                    
                    BufferedReader b1=new BufferedReader(f1);
                    BufferedReader b2=new BufferedReader(f2);
                    for(str1=b1.readLine(),str2=b2.readLine();str1!=null&&str2!=null;str1=b1.readLine(),str2=b2.readLine())
                    {
                        if(str2.equals(s1))
                        {
                            break;
                        }
                    }
                    FileReader f3=new FileReader(s1+".txt");
                    BufferedReader b3=new BufferedReader(f3);
                    
                    for(amt=b3.readLine();amt!=null;amt=b3.readLine())
                    {
                        str=amt;
                    }
                    //amt=b3.readLine();
                    b1.close();
                    b2.close();
                    b3.close();
                    f1.close();
                    f2.close();
                    f3.close();
                }
                catch(Exception ae)
                {
                }
                fhome.dispose();
                finfo=new JFrame("ACCOUNT DETAILS");
                finfo.setVisible(true);
                finfo.setSize(800,800);
                finfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                finfo.setLayout(null);
        
                infolbl=new JLabel("HI DETAILS:");
                lblname=new JLabel("NAME");
                username=new JLabel(str1);
                lblmobile=new JLabel("Mobile");
                mobile=new JLabel(s1);
                lblamount=new JLabel("Amount");
                amount=new JLabel(str);
                bok=new JButton("OK");
        
                infolbl.setBounds(325,100,300,30);
                lblname.setBounds(250,150,100,30);
                lblamount.setBounds(250,220,100,30);
                lblmobile.setBounds(250,185,100,30);
                mobile.setBounds(400,185,100,30);
                username.setBounds(400,150,100,30);
                amount.setBounds(400,220,100,30);
                bok.setBounds(325,275,100,30);
           
                finfo.add(infolbl);
                finfo.add(lblname);
                finfo.add(lblamount);
                finfo.add(bok);
                finfo.add(username);
                finfo.add(amount);
                finfo.add(mobile);
                finfo.add(lblmobile);
                
                handler l=new handler();
                bok.addActionListener(l);
            }
            if(e.getSource()==bok)
            {
                finfo.dispose();
                fhome.setVisible(true);
            }
            if(e.getSource()==blogout)
            {
                fhome.dispose();
                f1.setVisible(true);
            }
            if(e.getSource()==bdeposit)
            {
                fhome.dispose();
                fdep.setVisible(true);
            }
            if(e.getSource()==bdepok)
            {
                try
                {
                    FileReader f3=new FileReader(s1+".txt");
                    BufferedReader b3=new BufferedReader(f3);
                    String curr_amt=null;
                    String amt;
                    for(amt=b3.readLine();amt!=null;amt=b3.readLine())
                    {
                        curr_amt=amt;
                    }
                    f3.close();
                    b3.close();
                    
                    String input=txtdep.getText();
                    int cur_amount=Integer.parseInt(curr_amt);
                    int curr_input=Integer.parseInt(input);
                    int sum=cur_amount+curr_input;
                    String new_amt=String.valueOf(sum);
                    
                    FileWriter file4=new FileWriter(s1+".txt",true);
                    BufferedWriter b4=new BufferedWriter(file4);
                    b4.write(new_amt);
                    b4.newLine();
                    b4.close();
                    file4.close();
                }
                catch(Exception ae)
                {
                }
                fdep.dispose();
                fhome.setVisible(true);
            }
            if(e.getSource()==bwithdraw)
            {
                fhome.dispose();
                fwith.setVisible(true);
            }
            if(e.getSource()==bwithok)
            {
                try
                {
                    FileReader f3=new FileReader(s1+".txt");
                    BufferedReader b3=new BufferedReader(f3);
                    String curr_amt=null;
                    String amt;
                    for(amt=b3.readLine();amt!=null;amt=b3.readLine())
                    {
                        curr_amt=amt;
                    }
                    f3.close();
                    b3.close();
                    
                    String input=txtwith.getText();
                    int cur_amount=Integer.parseInt(curr_amt);
                    int curr_input=Integer.parseInt(input);
                    int sum=cur_amount-curr_input;
                    String new_amt=String.valueOf(sum);
                    
                    FileWriter file4=new FileWriter(s1+".txt",true);
                    BufferedWriter b4=new BufferedWriter(file4);
                    b4.write(new_amt);
                    b4.newLine();
                    b4.close();
                    file4.close();
                }
                catch(Exception ae)
                {
                }
                fwith.dispose();
                fhome.setVisible(true);
            }
            if(e.getSource()==btransfer)
            {
                fhome.dispose();
                ftransfer.setVisible(true);
            }
            if(e.getSource()==btranok)
            {
                ftransfer.dispose();
                fhome.setVisible(true);
            }
            if(e.getSource()==bdepok2)
            {
                try
                {
                    FileReader f3=new FileReader(s1+".txt");
                    BufferedReader b3=new BufferedReader(f3);
                    String curr_amt=null;
                    String amt;
                    for(amt=b3.readLine();amt!=null;amt=b3.readLine())
                    {
                        curr_amt=amt;
                    }
                    f3.close();
                    b3.close();
                    
                    String input=txtdep3.getText();
                    int cur_amount=Integer.parseInt(curr_amt);
                    int curr_input=Integer.parseInt(input);
                    int sum=cur_amount-curr_input;
                    String new_amt=String.valueOf(sum);
                    
                    FileWriter file4=new FileWriter(s1+".txt",true);
                    BufferedWriter b4=new BufferedWriter(file4);
                    b4.write(new_amt);
                    b4.newLine();
                    b4.close();
                    file4.close();
                }
                catch(Exception ae)
                {
                }
                try
                {
                    String temp=txtdep2.getText();
                    FileReader f3=new FileReader(temp+".txt");
                    BufferedReader b3=new BufferedReader(f3);
                    String curr_amt=null;
                    String amt;
                    for(amt=b3.readLine();amt!=null;amt=b3.readLine())
                    {
                        curr_amt=amt;
                    }
                    f3.close();
                    b3.close();
                    
                    String input=txtdep3.getText();
                    int cur_amount=Integer.parseInt(curr_amt);
                    int curr_input=Integer.parseInt(input);
                    int sum=cur_amount+curr_input;
                    String new_amt=String.valueOf(sum);
                    
                    FileWriter file4=new FileWriter(temp+".txt",true);
                    BufferedWriter b4=new BufferedWriter(file4);
                    b4.write(new_amt);
                    b4.newLine();
                    b4.close();
                    file4.close();
                }
                catch(Exception ae)
                {
                }
                ftransfer.dispose();
                fhome.setVisible(true);
            }
        }
    }
}