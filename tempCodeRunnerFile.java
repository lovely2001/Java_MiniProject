 if (ae.getSource()==b2){
            dispose();  
            loginpage pages = new loginpage();  
            pages.setSize(300,100);
            pages.setVisible(true); 
            pages.setLocationRelativeTo(null);
        }
        
        else if (ae.getSource()==b1){
            dispose();  
            Registration pages = new Registration();  
            pages.setSize(300,500);
            pages.setVisible(true); 
            pages.setLocationRelativeTo(null);
        }