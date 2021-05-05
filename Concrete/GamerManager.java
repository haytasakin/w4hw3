
public class GamerManager  {
	
	
	
	
	public void addGamer(Gamer gamer) {
		if(EdevletAdapter.IfRealPerson(gamer)) {
		System.out.println(gamer.getFirstName()+" "+ 
				gamer.getLastName()+" Adlý oyuncu eklendi.");
		}
		else {
			System.out.println("Kullanýcý geçerli deðil.");
		}
	}
	
	public void updateGamer(Gamer gamer,String firstName,String lastName,String nationalityId,String dateOfBirth) {

		gamer.setFirstName(firstName);
		gamer.setLastName(lastName);
		gamer.setDateOfBirth(dateOfBirth);
	    gamer.setnationalityId(nationalityId);
	    System.out.println("Kullancý güncellendi."+ gamer.getFirstName()+" "+gamer.getLastName());
	}
	
	public void deleteGamer(Gamer gamer) {
		System.out.println("Kullancý silindi.");
	}

}
