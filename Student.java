class Student{
              int rollno;
              double mark;
              int std;
     void info()
               {
                System.out.println("Rollno="+rollno+"\n"+"Mark="+mark+"\n"+"Standard="+std);
               }
     void groupSelection(double a)
               {
                int extra=10;
                double marks=a+extra;
               if (marks>=400&&marks<=500)
                    {
                     System.out.println("your course is Bio-maths");
                     }
                   else if (marks>350&&marks<=399)
                    {
                     System.out.println("Your course is Computer science");
                     }
                    else if (marks>300&&marks<=350)
                       {
                       System.out.println("Your course is Business maths");
                       }
                    else 
                        {
                        System.out.println("NO group are available");                        
                        }        
                }
public static void main(String[]args)
                                    {
                                    Student s1=new Student();
                                     Student s2=new Student();
                                     s1.rollno=123;
                                     s1.mark=375;
                                     s1.std=10;
                                     s2.rollno=134;
                                     s2.mark=470;
                                     s2.std=10;
                                     s1.info();
                                     s1.groupSelection(s1.mark);
                                     s2.info();
                                     s2.groupSelection(s2.mark);

                                    }
                            }
