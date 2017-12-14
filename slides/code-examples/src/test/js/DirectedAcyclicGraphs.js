

// Files
// lire directement les poms.xml / package.json / compose.json



const raw_nodes = [
    {id: "projectA", dependencies: ["projectB", "projectC"]},
    {id: "projectB"},
    {id: "projectC", dependencies: ["projectB"]},
];



const edges = [
    ["projectA", "projectB"],
    ["projectA", "projectC"],
    ["projectC", "projectB"],
];


















const edges_complex = [
    ["projectA", "projectB"],
    ["projectA", "projectC"],
    ["projectA", "projectB"],
    ["projectC", "projectB"],
    ["projectC", "projectD"],
    ["projectD", "projectE"],
    ["projectE", "projectF"],
    ["projectE", "projectB"],
];




