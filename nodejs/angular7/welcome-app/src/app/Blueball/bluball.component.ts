import { Component } from "@angular/core";

@Component({
  selector:'app-root',
  templateUrl:'./blueball.component.html'
})

export class BlueballComponent{
  buttonlist=[];
  obj:any ={
    id:1,
    color:'',
    visibility: false
  }
  randomnum:number=0;
  isHidden: boolean ;
  isShown: boolean=true ;
  timeLeft: number = 10;
  attempts:number=5;
  interval;
  createbutton(){
    this.isHidden = true;
    this.isShown=false
    for(let k=0; k<50; k++){
      this.obj={
        id:k,
        color:'grey',
        visibility:false
      }
      this.buttonlist[k]=this.obj;
    }
    this.randomnum=Math.floor(Math.random() * (50))
    console.log(this.randomnum)
    this.startTimer();
  }
  startTimer() {
    this.interval = setInterval(() => {
      if(this.timeLeft > 0) {
        this.timeLeft--;
      } else {
        // this.timeLeft = 60;
        clearInterval(this.interval);
        this.isHidden=false
        this.isShown=true
        location.reload();
      }
    },1000)
  }
  getbtnid(events){
    this.attempts--;
    if(this.attempts<=0){
      this.isShown=true
      this.isHidden=false
      location.reload();
    }
    console.log(events.target.id)

    if(this.randomnum==events.target.id ){
      this.buttonlist[events.target.id].color='blue';
      this.buttonlist[events.target.id].visibility=true
       alert("You Are Won")
       setTimeout(()=>{
        this.isHidden=false
        this.isShown=true
        location.reload();
   }, 3000);

    }
    else if(this.randomnum<events.target.id){
      this.buttonlist[events.target.id].color='red';
      this.buttonlist[events.target.id].visibility=true
    }
    else{
      this.buttonlist[events.target.id].color='green';
      this.buttonlist[events.target.id].visibility=true
    }

  }

}
