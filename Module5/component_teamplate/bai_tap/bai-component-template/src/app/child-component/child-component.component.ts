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
  @Input()
  titleFromParent: string;
  @Output()
  closed = new EventEmitter<Parent>();
  @Output()
  edited = new EventEmitter<number>();
  @Input()
  numberEdit: number;
  @Output()
  sendMessage = new EventEmitter<string>();
  constructor() { }

  ngOnInit(): void {
  }

  updateInfoParent(nameEdit: string, birthdayEdit: string, wifeNumberEdit: number) {
    this.parentEdit.name = nameEdit;
    this.parentEdit.birthday = birthdayEdit;
    this.parentEdit.wifeNumber = wifeNumberEdit;
    this.numberEdit++;
    this.edited.emit(this.numberEdit);
    this.sendMessage.emit('Updated ' + nameEdit + ' ( message from child )');
  }
}
