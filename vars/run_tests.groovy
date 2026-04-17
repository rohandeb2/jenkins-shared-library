def call() {
    echo "Running unit tests..."
    sh "npm test"
    echo "Unit tests completed successfully."
}
