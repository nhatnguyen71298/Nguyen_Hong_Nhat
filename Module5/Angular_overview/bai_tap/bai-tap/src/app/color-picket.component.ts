import {Component, OnInit} from '@angular/core' ;

@Component({
  template:
    '<h1 [style.color]="background" >♥♥♥♥♥♥♥♥♥</h1>\n' +
    '<h2>Color Picker</h2>\n' +
    '<div>\n' +
    '  <label>Chọn màu:</label>\n' +
    '  <input [value]="background" type="color" (change)="onChange($event.target.value)">\n' +
    '</div>\n' +
    '\n' +
    '<p>Output:</p><br>' +
    '<div class="color-preview" [style.background]="background" ></div>' ,
  selector: 'color-picket' ,
  styleUrls: ['./app.component.css']
})
export class ColorPickerComponent implements OnInit {
  background = '#00e067';
  constructor() { }
  onChange(value) {
    this.background = value;
  }
  ngOnInit() {
  }
}
