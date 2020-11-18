import { Component } from '@angular/core' ;

@Component({
  template: '<h2>Awesome Calculator</h2>\n' +
    '<div>\n' +
    '<input type="number" (change)="onFirstChange($event.target.value)">\n' +
    '  <select\n' +
    '    class="form-input"\n' +
    '    [value]="operator"\n' +
    '    (change)="onSelectChange($event.target.value)">\n' +
    '    <option value="+">+</option>\n' +
    '    <option value="-">-</option>\n' +
    '    <option value="*">*</option>\n' +
    '    <option value="/">/</option>\n' +
    '  </select>\n' +
    '<input type="number" (change)="onSecondChange($event.target.value)">\n' +
    '</div>\n' +
    '<div>\n' +
    '  <button class="form-input" (click)="calculate()">\n' +
    '    Thực thi\n' +
    '  </button>\n' +
    '</div>\n' +
    '<div class="output">\n' +
    '  {{output}}\n' +
    '</div>',
  selector: 'calculator',
  styleUrls: ['./app.component.css']

})
export class CalculatorComponent {
  output: number;
  first: number;
  second: number;
  operator = '+';
  onFirstChange(value) {
    this.first = Number(value);
  }
  onSecondChange(value) {
    this.second = Number(value);
  }
  onSelectChange(value) {
    this.operator = value;
  }
  calculate() {
    switch (this.operator) {
      case '+':
        this.output = this.first + this.second;
        break;
      case '-':
        this.output = this.first - this.second;
        break;
      case '*':
        this.output = this.first * this.second;
        break;
      case '/':
        this.output = this.first / this.second;
        break;
    }
  }
}
