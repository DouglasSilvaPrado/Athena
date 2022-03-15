function CourseCard() {
    const course = {
        id:1,
        image: "https://robertmarshall.dev/static/d71528d312b579dd0449078f8a8f56ab/b5380/reactjs-1.png",
        name: "React",
        description: "Curso de React basico",
        duration: 7
    }
    return ( 
        <>
            <div className="card w-100 text-ce" >
                <img src={course.image} className="card-img-top" alt={course.name}/>
                <div className="card-body">
                    <h5 className="card-title">{course.name}  {`[${course.duration} Horas]`}</h5>
                    <p className="card-text">{course.description}</p>
                    <a href="#" className="btn btn-primary w-100">Começar</a>
                </div>
            </div>
            
        </>
     );
}

export default CourseCard;