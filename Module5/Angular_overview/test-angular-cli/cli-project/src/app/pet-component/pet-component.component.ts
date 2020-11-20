import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pet-component',
  templateUrl: './pet-component.component.html',
  styleUrls: ['./pet-component.component.css']
})
export class PetComponentComponent implements OnInit {

  constructor() { }
  petName = 'Lương Vũ Quang Đin';
  petImage = 'https://scontent.fsgn2-3.fna.fbcdn.net/v/t1.0-9/67797272_481890285933386_1724639539273662464_n.jpg?_nc_cat=108&ccb=2&_nc_sid=85a577&_nc_ohc=NKw9ZGFAiUoAX_ozg8l&_nc_ht=scontent.fsgn2-3.fna&oh=f8ec87d6caa053e87b2120fd422adb90&oe=5FDA4703';

  ngOnInit(): void {
  }

  updateName(name) {
    this.petName = name;
  }

  updateImage(image) {
    this.petImage = image;
  }
}
