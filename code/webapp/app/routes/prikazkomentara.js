import Ember from 'ember';

export default Ember.Route.extend({
    ajax: Ember.inject.service(),
	model() {
		return this.get('ajax').request('http://localhost:8080/komentari/get/all', { method: 'GET' });
	}
});
