import axios from "axios";
import { useEffect, useState } from "react";
import CourseCard from "../../layout/CourseCard";
import { CoursePage } from "../../types/course";
import { BASE_URL } from "../../utils/requests";

function Course() {

    
  const [pageNumber, setPageNumber] = useState(0)

  const [page, setPage] = useState<CoursePage>({
    content: [],
    last: true,
    totalPages: 0,
    totalElements: 0,
    size: 12,
    number: 0,
    first: true,
    numberOfElements: 0,
    empty: true
  })
  useEffect(() => {
    axios.get(`${BASE_URL}/courses?size=9&page=${pageNumber}&sort=id`)
    .then(response => {
      const data = response.data as CoursePage
      setPage(data)
    })

  }, [pageNumber])

  const handlePageChange = (newPageNumber: number) => {
    setPageNumber(newPageNumber);
  }

    

    return ( 
        <>
        
        <div className="container">
            <h1>Cursos</h1>
            <div className="row">
                {page.content.map(course => (
                    <div key={course.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <CourseCard course={course} />
                    </div>
                )
                )}   
            </div>
        </div>
            
        </>
     );
}

export default Course;