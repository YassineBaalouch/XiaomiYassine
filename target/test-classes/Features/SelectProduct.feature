#Author: Yassine

Feature: Select Product
Scenario: choisir un produit
Given Utilisateur dans la page Maison connectée
When utilisateur effectue un tri avec le prix croissant And utilisateur choisis "Mi Temperature and Humidity Monitor Pro"
Then utilisateur se derige vers la page du produit "Mi Temperature and Humidity Monitor Pro"