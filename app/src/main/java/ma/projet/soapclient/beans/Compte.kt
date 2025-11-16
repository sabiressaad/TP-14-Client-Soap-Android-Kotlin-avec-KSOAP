package ma.projet.soapclient.beans

import java.util.Date

// Classe de données représentant un compte bancaire
data class Compte(
    val id: Long?,              // Identifiant unique
    val solde: Double,          // Solde du compte
    val dateCreation: Date,     // Date de création
    val type: TypeCompte        // Type de compte (COURANT ou EPARGNE)
)
