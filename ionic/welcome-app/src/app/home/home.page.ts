import { Component } from '@angular/core';
import { AlertController } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  constructor(  private alertCtrl:AlertController) {
    this.showAlert()
  }
  async showAlert() {
    const alert = await this.alertCtrl.create({
      message: "Hello There",
      subHeader: "I'm a subheader",
      buttons: ['Dismiss']
      
    });
  
    await alert.present();
  }
}
