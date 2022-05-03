<?php
        /*

        Page index.php

        Affichage de profil.


        */

        
        header('Content-type: text/html; charset=utf-8');
        include('includes/config.php');

        /********Actualisation de la session...**********/
        //Les fonctions

        include('includes/fonctions.php');

        
       




        /********Fin actualisation de session...**********/



        /********En-tête et titre de page*********/

      

        include('includes/haut_de_page.php'); //contient le doctype, et head.

        /**********Fin en-tête et titre***********/
?>




                <!--contenu//-->
                
                        <div class="article">
                          <ul>
                                <li id="article1"> <a href="avantage.php">Les avantages</a> </li> 
                                <li id="article2"> <a href="admin/article.php">Les projets</a> </li>
                                <li id="article3"> <a href="membres/forum.php">La communauté</a> </li> 
                                <li id="article4"> <a href="infos.php">Qui sommes-nous?</a> </li>
                                
                          </ul>
                          
                        </div> 

                                   <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> <br><br><br><br> 
                     
                                
          <?php
                include('includes/bas_de_page.php');
          ?>
