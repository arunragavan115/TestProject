package Projects;

public class Hospital_Management_Proj {

	public static void main(String[] args) {

	}

	class hospitals {
		int permission_id;
		String hospital_name;
		String hospital_type;
		String hospital_description;
		String hospital_place;
		String  hospital_address;
		String doctor_id;

	}
	class appointments {
		int appointment_id;
		int doctor_id;
		String appointment_number;
		String appointment_type;
		String appoinment_date;
		String description;

	}
	class doctors {
		int doctor_id;
		String doctor_name;
		String doctor_mobile;
		String doctor_email;
		String doctor_address;
		String doctor_password;
		String username;

	}
	class medicines{
		int medicines_id;
		String medicines_name;
		String medicines_company;
		String medicines_cost;
		String medicines_type;
		String medicines_description;
		
	}
	class permission{
		int permission_id;
		int permission_role_id;
		String permission_title;
		String permission_module;
		String description;
	}
	class patient{
		int patient_id;
		String patient_mobile;
		String patient_email;
		String patient_name;
		String patient_password;
		String patient_address;
		String patient_username;
	}
}
