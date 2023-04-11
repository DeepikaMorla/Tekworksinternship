class ArogyaHospitalData
  {
    int patient_id;
    String name;
    int age;
    String gender;
    long adhar_number;
    long contact_number;
    long emergency_number;
    String city;
    String address;
    String date_of_admit;
    String  guardians_name;
    String guardians_addr;
    long gurdians_contact_number;

    public ArogyaHospitalData(int pi ,String n,int a,String g , long an , long cn , long en,String c , String ad , String doa ,String gna, String ga , long gcn)
    {
      patient_id = pi;
      name = n;
      age = a;
      gender = g;
      adhar_number = an;
      contact_number = cn;
      emergency_number = en;
      city = c;
      address = ad;
      date_of_admit = doa;
       guardians_name = gna;
      guardians_addr = ga;
      gurdians_contact_number = gcn;
      
    }
    public int getPatient_id(){
      return patient_id;
    }

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public long getAdhar_number() {
		return adhar_number;
	}

	public long getContact_number() {
		return contact_number;
	}

	public long getEmergency_number() {
		return emergency_number;
	}

	public String getCity() {
		return city;
	}

	public String getAddress() {
		return address;
	}
  public String getDate_of_admit() {
		return date_of_admit;
	}
    public String getGuardians_name() {
		return guardians_name;
	}

	public String getGuardians_addr() {
		return guardians_addr;
	}
  
    public long getGurdians_contact_number() {
		return gurdians_contact_number;
	}
    public String toString(){
      return patient_id + "" + name + " " + age + " " + gender + " " + adhar_number + " " + contact_number + " " + emergency_number + " " + city + " " + address + " " + date_of_admit + " " + guardians_name + " " + guardians_addr + " " + gurdians_contact_number;
    }

    
  }
