import Ember from 'ember';

export default Ember.Controller.extend({
	registracijaService: Ember.inject.service(),

	register: function(korisnik) {
		
        this.get('registracijaService').register(korisnik);
		alert("nesto");
    },

    actions: {
    	register: function(){
			
			let korisnik = this.getProperties('ime', 'username', 'password', 'email');
			
			this.register(korisnik);
			
    	}
    }
});