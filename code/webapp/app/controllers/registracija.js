import Ember from 'ember';

export default Ember.Controller.extend({
	// registracijaService: Ember.inject.service(),

	// register: function(korisnik) {
		
    //     this.get('registracija-service').register(korisnik);
	// 	alert("nesto");
    // },

    actions: {
    	register: function(){
			Ember.$.ajax({
				url: "http://localhost:8080/korisnici/register",
				type: "POST",
				contentType: "application/json",
				data: JSON.stringify({
					"korisnik" : {
						"ime":  this.get('ime'),
						"username":  this.get('username'),
						"password": this.get('password'),
						"email": this.get('email'),
					} 
				})
			}).then(() => {
				console.log("uspjelo");
			}).catch(function(error) {
				alert(error.error);
    		  });

			
			// let korisnik = this.getProperties('ime', 'username', 'password', 'email');
			
			// this.register(korisnik);
    	}
    }
});