#Author: Yassine

Feature: Ajout Panier
Scenario: ajout produit au panier 
Given Utilisateur dans la page du produit Mi Temperature and Humidity Monitor Pro
When utilisateur ajoute le produit Mi Temperature and Humidity Monitor Pro dans le panier 
Then "Mi Temperature and Humidity Monitor Pro" est disponible dans le panier 