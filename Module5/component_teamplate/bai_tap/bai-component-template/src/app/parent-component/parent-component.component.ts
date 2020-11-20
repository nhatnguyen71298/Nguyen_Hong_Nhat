import { Component, OnInit } from '@angular/core';
import {Parent} from './Parent';
import {parentRepository} from './ParentDao';

@Component({
  selector: 'app-parent-component',
  templateUrl: './parent-component.component.html',
  styleUrls: ['./parent-component.component.css']
})
export class ParentComponentComponent implements OnInit {
  parentList: Parent[] = parentRepository;
  parentDetail: Parent;
  numberEdited = 0;
  constructor() { }

  ngOnInit(): void {
  }

  getInfoParent(parentInfo: Parent) {
    this.parentDetail = parentInfo;
  }

  updateNumberEdit(numberEdit: number) {
    this.numberEdited = numberEdit;
  }

  closed(closed: Parent) {
    this.parentDetail = closed;
  }
}
