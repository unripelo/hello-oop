class address {
    public String Name;
    private String Address;
    private String Telephone_Number;
    private String Email_Address;

    public address(String var1, String var2, String var3, String var4) {
        this.Name = var1;
        this.Address = var2;
        this.Telephone_Number = var3;
        this.Email_Address = var4;
    }

    public void setAddress(String var1) {
        this.Address = var1;
    }

    public void setTelephoneNumber(String var1) {
        this.Telephone_Number = var1; 
    }

    public void setEmailAddress(String var1) {
        this.Email_Address = var1;
    }

    public String getAddress() {
        return this.Address;
    }

    public String getTelephoneNumber() {
        return this.Telephone_Number;
    }

    public String getEmailAddress() {
        return this.Email_Address;
    }
}
