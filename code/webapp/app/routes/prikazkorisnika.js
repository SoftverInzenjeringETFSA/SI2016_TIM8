import Ember from 'ember';

export default Ember.Route.extend({
    ajax: Ember.inject.service(),
	model() {
		return this.get('ajax').request('http://localhost:8080/korisnici/get/all', { method: 'GET' });
	}
});
