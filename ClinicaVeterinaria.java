package petShop;

public class ClinicaVeterinaria {

	public static void main(String[] args) {
		
		Cliente dono1 = new Cliente();
		dono1.setNome("joao");
		dono1.setTelefone(1234);
		
		Cliente dono2 = new Cliente();
		dono2.setNome("xavier");
		dono2.setTelefone(1234);
		
		Cachorro rex = new Cachorro("Rex", "Pitbull", 7, dono2);
		Cachorro thor = new Cachorro("Thor", "Husky Siberiano", 6, dono1);
		
		
		rex.setNome("Rex");
		rex.setRaca("Pitbull");
		rex.setIdade(7);
		rex.setFaminto(true);
		rex.setDono(dono2);
		
		
		thor.setNome("Thor");
		thor.setRaca("Husky Siberiano");
		thor.setIdade(6);
		thor.setFaminto(false);
		thor.setDono(dono1);
		
	System.out.println(Cachorro.qntC);

		
		
		
		

	}

}