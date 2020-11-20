import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Parent} from '../parent-component/Parent';

@Component({
  selector: 'app-child-component',
  templateUrl: './child-component.component.html',
  styleUrls: ['./child-component.component.css']
})
export class ChildComponentComponent implements OnInit {
  @Input()
  parentEdit: Parent;
  parentClosed: Parent;
  @Output()
  closed = new EventEmitter<Parent>();
  @Output()
  edited = new EventEmitter<number>();
  @Input()
  numberEdit: number;
  constructor() { }

  ngOnInit(): void {
  }

  updateInfoParent(nameEdit: string, birthdayEdit: string, wifeNumberEdit: number) {
    this.parentEdit.name = nameEdit;
    this.parentEdit.birthday = birthdayEdit;
    this.parentEdit.wifeNumber = wifeNumberEdit;
    this.numberEdit++;
    this.edited.emit(this.numberEdit);
  }

  close() {
    this.closed.emit(this.parentClosed);
  }
}
