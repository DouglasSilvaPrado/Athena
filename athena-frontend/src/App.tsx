import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Navbar from "./components/layout/Navbar";
import Course from "./components/pages/course";
import Home from "./components/pages/home";

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/cursos" element={<Course />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
