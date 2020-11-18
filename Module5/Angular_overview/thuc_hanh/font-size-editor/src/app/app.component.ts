import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  fontSize = 14;
  constructor() {}
  onChange(value) {
    this.fontSize = value;
  }
  ngOnInit() {
  }
}
