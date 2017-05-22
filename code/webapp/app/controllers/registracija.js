import Ember from 'ember';

export default Ember.Controller.extend({
	// registracijaService: Ember.inject.service(),

	// register: function(korisnik) {
		
    //     this.get('registracija-service').register(korisnik);
	// 	alert("nesto");
    // },

    actions: {
    	register: function(){
			let podaci=JSON.stringify({
					//'korisnik' : {
						ime:  this.get('ime'),
						username:  this.get('username'),
						password: this.get('password'),
						email: this.get('email'),
						broj_tacnih_prijava: 0,
						broj_netacnih_prijava: 0,
						admin: 0
						//super-admin: 0
					//} 
				});
			Ember.$.ajax({
				url: "http://localhost:8080/korisnici/register",
				type: "POST",
				contentType: "application/json",
				data: podaci
			}).then(() => {
				alert("Registracija uspjela");
			}).catch(function(error) {
				alert(error.error);
    		  });

			
			// let korisnik = this.getProperties('ime', 'username', 'password', 'email');
			
			// this.register(korisnik);
    	}
    }
});