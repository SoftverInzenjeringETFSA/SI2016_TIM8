import Ember from 'ember';
import config from './config/environment';

const Router = Ember.Router.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('početna');
  this.route('pregledpatrola');
  this.route('pomoć');
  this.route('onama');
  this.route('kontakt');
  this.route('prijava');
  this.route('registracija');
});
export default Router;
